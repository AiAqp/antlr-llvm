; ModuleID = "/Users/pawelszetela/antlr-llvm/Compiler.py"
target triple = "unknown-unknown-unknown"
target datalayout = ""

%"s1" = type {i64, i64, double}
define void @"main"() 
{
"entry main":
  %".2" = alloca %"s1"
  call void @"enter initializer"(%"s1"* %".2", i64 1, i64 2, double 0x3f847ae147ae147b)
  ret void
}

define void @"enter initializer"(%"s1"* %".1", i64 %".2", i64 %".3", double %".4") 
{
"enter initializer":
  %".6" = getelementptr inbounds %"s1", %"s1"* %".1", i32 0, i32 0
  store i64 %".2", i64* %".6", align 1
  %".8" = getelementptr inbounds %"s1", %"s1"* %".1", i32 0, i32 1
  store i64 %".3", i64* %".8", align 1
  %".10" = getelementptr inbounds %"s1", %"s1"* %".1", i32 0, i32 2
  store double %".4", double* %".10", align 1
  ret void
}

define i64 @"f1"(%"s1"* %".1", i64 %".2", i64 %".3") 
{
"start f1":
  %".5" = add i64 %".2", %".3"
  ret i64 %".5"
}
