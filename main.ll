; ModuleID = "/Users/pawelszetela/antlr-llvm/Compiler.py"
target triple = "unknown-unknown-unknown"
target datalayout = ""

%"class" = type {i32}
define void @"main"() 
{
"entry main":
  ret void
}

@"a" = internal global i64 add (i64 add (i64 2, i64 2), i64 2)
@"b" = internal global double 0x3f847ae147ae147b
define i64 @"f1"(i64 %".1", i64 %".2") 
{
"start f1":
  %".4" = add i64 %".2", %".1"
  ret i64 %".4"
}

@"out" = internal global i64 2
define void @"initializer"(%"class"* %".1", ...) 
{
initializer:
  %".3" = getelementptr inbounds %"class", %"class"* %".1", i32 0, i32 0
  store i32 0, i32* %".3", align 1
}
