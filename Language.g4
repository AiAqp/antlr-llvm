grammar Language;
start : (n_func | n_clas | instr)+;

instr: (RET? (assign | call | n_if | n_for))+;

expression           
    :  expression ((PLS | MNS | MUL | DIV | EXP) expression)+                       #expressionArithm
    |  expression (EQ | NEQ | GT | GTE | LS | LSE | NOT | AND | OR) expression      #expressionBool
    |  LRB expression RRB                                                           #expressionNested                
    |  value                                                                        #expressionnumber
    ;   
 
n_func : 'function' (ID | 'init' | 'print' | 'scan' | 'main') LRB (ID | assign) (COM (ID | assign))* RRB instr* 'end';       
n_clas : 'class' ID 'is' assign* n_func* 'end';                              
N_STRING : APO .*? APO;                                                  
n_array : LCB array_row (SEM array_row)* RCB;
n_if : 'if' expression 'then' instr* ('elif' expression 'then' instr*)* ('else' instr*)? 'end';
n_for : 'for' (INT_seqc | INT | assign) 'go' instr* 'end';                                             

array_row 
    : seqc
    | value (COM value)*
    ;
   
call : (ID | 'print') (clas | func_clas | array);

clas : DOT (func_clas | ID);
func_clas : LRB (value | assign (COM (value | assign))*)? RRB;
array : LSB array_range (SEM array_range)? RSB;

array_range
    : INT (COM INT)*
    | COL
    | INT_seqc
    ;

value : (BOOL | ID | number | N_STRING | n_array | call);

assign : EXPLCT? EXPLCT? (ID ASN (value | expression) | ID);

EXPLCT : ('global' | 'local') | TYP;

seqc : number COL number (COL number)?;

INT_seqc : INT COL INT;

TYP : 'bool' | 'int' | 'str' | 'array' | 'struct';

number: MNS? (DECIMAL | INT);

DECIMAL : INT? DOT INT; 

INT : [0-9]+;
ID : [a-zA-Z0-9_]+;
BOOL : 'true' | 'false';

PLS : '+';
MNS : '-';
MUL : '*';
DIV : '/';
EXP : '^';
LRB : '(';
RRB : ')';
LSB : '[';
RSB : ']';
LCB : '{';
RCB : '}';
EQ : '==';
NEQ : '!=' | '=!';
GT : '>';
GTE : '>=' | '=>';
LS : '<';
LSE :'<=' | '=<';
AND : '&&';
OR : '||';
NOT : '!';
ASN : '=';
DOT : '.';
COL : ':';
COM : ',';
SEM : ';';
RET : 'return';
APO : '\'';

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

WS
   : [ \r\n\t] + -> skip
   ;