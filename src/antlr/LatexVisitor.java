// Generated from C:/Uczelnia/S5/JFK/latex_antlr/antlr\Latex.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatexParser#dzialanie1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDzialanie1(LatexParser.Dzialanie1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#dzialanie2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDzialanie2(LatexParser.Dzialanie2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#dzialanie3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDzialanie3(LatexParser.Dzialanie3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#dzialanie4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDzialanie4(LatexParser.Dzialanie4Context ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#dzialanie5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDzialanie5(LatexParser.Dzialanie5Context ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#operacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacja(LatexParser.OperacjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#rownanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRownanie(LatexParser.RownanieContext ctx);
}