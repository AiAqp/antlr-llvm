; ModuleID = "/Users/pawelszetela/antlr-llvm/Compiler.py"
target triple = "unknown-unknown-unknown"
target datalayout = ""

%"s1" = type {i64, i64, double}
define void @"main"() 
{
"entry main":
  ret void
}

define i64 @"f1"(i64 %".1", i64 %".2") 
{
"start f1":
  %".4" = add i64 %".1", %".2"
  ret i64 %".4"
}
