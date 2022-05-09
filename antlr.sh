export CLASSPATH=".:/opt/homebrew/Cellar/antlr/antlr4-runtime-4.9.3.jar:$CLASSPATH" 

antlr -Dlanguage=Python3 Language.g4 -o generated 
python3 run.py script.language


antlr -Dlanguage=Python3 Language.g4 -o generated && antlr Language.g4 -o java_generated && cd java_generated && javac Language*.java && grun Language start ../script.language -gui && cd ..
cd generated && pygrun Language start --tree --sll ../script.language && cd ..
antlr -Dlanguage=Python3 Language.g4 -o generated