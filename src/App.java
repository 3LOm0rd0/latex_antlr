import antlr.LatexLexer;
import antlr.LatexParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        CharStream charStream;
        LatexLexer lexer;
        TokenStream tokenStream;
        LatexParser parser;
        ParseTree tree;
        int errors;
        Scanner scan = new Scanner(System.in);
        String input;

        System.out.println("Enter equation:");

        input = scan.nextLine();

        while(!input.contains("exit")){
            charStream = CharStreams.fromString(input);
            lexer = new LatexLexer(charStream);
            tokenStream = new CommonTokenStream(lexer);
            parser = new LatexParser(tokenStream);
            parser.setBuildParseTree(true);
            try{
                tree = parser.rownanie();
                errors = parser.getNumberOfSyntaxErrors();
                if(errors == 0 ) {
                    System.out.println(tree.toStringTree(parser));
                }
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Syntax error");
            }
            System.out.println("Enter equation:");
            input = scan.nextLine();
        }
    }






}
