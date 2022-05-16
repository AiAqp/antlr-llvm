; ModuleID = "/Users/pawelszetela/antlr-llvm/Compiler.py"
target triple = "unknown-unknown-unknown"
target datalayout = ""

%"s1" = type {i64, i64, double}
define void @"main"() 
{
"entry main":
  ret void
}

define void @"initializer"(%"s1"* %".1", ...) 
{
initializer:
  %".3" = getelementptr inbounds %"s1", %"s1"* %".1", i32 0, i32 0
  store i64 0, i64* %".3", align 1
  %".5" = getelementptr inbounds %"s1", %"s1"* %".1", i32 0, i32 1
  store i64 0, i64* %".5", align 1
  %".7" = getelementptr inbounds %"s1", %"s1"* %".1", i32 0, i32 2
  store double              0x0, double* %".7", align 1
}

define i64 @"f1"(%"s1"* %".1", i64 %".2", i64 %".3") 
{
"start f1":
  %".5" = add i64 %".2", %".3"
  ret i64 %".5"
}

@"new_s1" = internal global double 0x3f847ae147ae147b