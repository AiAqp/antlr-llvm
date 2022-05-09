grammar Language;
start : (n_func | n_clas | instr)+;

instr
    : ('return'? (assign | call | n_if | n_for)
    | 'return' expression)+
    ;

expression           
    :  expression ((PLS | MNS | MUL | DIV | EXP) expression)+                       #expressionArithm
    |  expression (EQ | NEQ | GT | GTE | LS | LSE | NOT | AND | OR) expression      #expressionBool
    |  LRB expression RRB                                                           #expressionNested                
    |  value                                                                        #expressionValue
    ;   
 
n_func : 'function' (ID | 'init' | 'print' | 'scan' | 'main') LRB ((ID | assign) (COM (ID | assign))*)? RRB instr* 'end';       
n_clas : 'class' ID 'is' assign* n_func* 'end';                              
N_STRING : APO .*? APO;                                                  
n_array : LSB array_row (SEM array_row)? RSB;
n_if : 'if' expression' then' instr* ('elif' expression 'then' instr*)* ('else' instr*)? 'end';
n_for : 'for' ((INT COL INT) | INT | assign) 'go' instr* 'end';                                             

array_row : value (COM value)*;
   
call : ID (clas | func_clas | array);

clas : DOT (func_clas | ID);
func_clas : LRB (value | assign (COM (value | assign))*)? RRB;
array : LSB array_range (SEM array_range)? RSB;

array_range
    : INT (COM INT)*
    | COL
    | INT COL INT
    ;


value 
    : BOOL          #valueBool
    | ID            #valueID
    | MNS? DECIMAL  #valueDecimal
    | MNS? INT      #valueInt
    | N_STRING      #valueString
    | n_array       #valueArray
    | call          #valueCall
    ;

assign 
    : SCOPE? TYP? ID ASN (value | expression) #assignEvaluate
    | SCOPE? TYP? ID ASN ID #assignID
    | SCOPE? TYP? ID #assignUninit
    ;

SCOPE : 'global' | 'local';
TYP : 'bool' | 'int' | 'str' | 'array' | 'struct' | 'double';

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