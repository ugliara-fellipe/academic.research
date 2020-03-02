package ast;

/**
 * this enumeration gives the kind of metaobject parameters. Some metaobjects
 * should not take parameters, other should take just one, others can take
 * zero or more parameters, and so on.
 * For example, metaobject feature takes two parameters and therefore it is
 * of the kind TwoParameters:<br>
 * <code>
 *      {@literal @}feature<< "author", "Jos�" >><br>
 *      {@literal @}feature<< "Version", 2.15 >><br>
 *      object Test <br>
 *          ...<br>
 *      end<br>
 * </code>
 *  Each parameter should be a Cyan expression
 * 
   @author Jos�
 */
public enum MetaobjectArgumentKind {
	ZeroParameter,               // the metaobject should not take parameters
	ZeroOrMoreParameters,        // zero or more parameters and these should be Cyan expressions 
	OneParameter,                // one parameters and this should be a Cyan expression
	TwoParameters,               // two parameters and these should be Cyan expressions
	OneOrMoreParameters,         // one or more parameters and these should be Cyan expressions
}
