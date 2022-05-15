grammar Language;
start : (n_func | n_clas | instr)+;


instr : (assign | n_if | n_for | call)+ ;

terminal : 'return' (assign | expression);

terminable : (instr | terminal)+;


expression           
    :  expression OP_ARTH expression                       #expressionArithm
    |  expression (EQ | NEQ | GT | GTE | LS | LSE | NOT | AND | OR) expression      #expressionBool
    |  LRB expression RRB                                                           #expressionNested                
    |  value                                                                        #expressionValue
    ;   
OP_ARTH : PLS | MNS | MUL | DIV | EXP;

n_func : TYP 'function' ID LRB (assign (COM assign)*)? RRB terminable? 'end';       
argument : TYP ID;

n_clas : 'class' ID arg_typs n_func* 'end';

n_struct : 'struct' ID arg_typs;

arg_typs : LCB assign+ RCB;

N_STRING : APO .*? APO;

n_array : LSB array_row (SEM array_row)? RSB;

n_if : 'if' expression' then' terminable ('elif' expression 'then' terminable)* ('else' terminable)? 'end';

n_for : 'for' ((INT COL INT) | INT | assign) 'go' instr 'end';                                             

array_row : value (COM value)*;
   
call 
    : ID LSB array_range? RSB #array
    | ID LRB (value (COM value)*)? RRB #functionCall
    | ID DOT (call | ID) #classCall
    ;

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
    : SCOPE? TYP? ID ASN expression #assignEvaluate
    | SCOPE? TYP? ID ASN ID #assignID
    | SCOPE? TYP? ID #assignUninit
    ;

SCOPE : 'global' | 'local';
TYP : 'bool' | 'int' | 'str' | 'array' | 'struct' | 'double' | 'void';

BOOL : 'true' | 'false';
DECIMAL : INT? DOT INT; 
INT : [0-9]+;

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

ID : [a-zA-Z0-9_]+;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

WS
   : [ \r\n\t] + -> skip
   ;