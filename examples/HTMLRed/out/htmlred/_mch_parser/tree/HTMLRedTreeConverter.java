/* generated from model null*/
/* generated by template mchtree.TreeConverter*/


package htmlred._mch_parser.tree;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CommonTokenFactory;

import com.upstandinghackers.hammer.*;

public class HTMLRedTreeConverter 
{
	public static ParseTree create(ParseResult parseResult)
	{
		return generateParseTree(parseResult.getAst());
	}
	
	public static HAParseTree generateParseTree( ParsedToken tok )
	{    	
		CommonTokenFactory fac = new CommonTokenFactory();
		
		if( tok != null )
		{
			int tt = tok.getTokenTypeInternal();
			if(tt == Hammer.TokenType.NONE.getValue())
			{	
    		}
			else if(tt == Hammer.TokenType.BYTES.getValue())
			{
				byte[] bytes = tok.getBytesValue(); 
				for( byte b : bytes )
				{
					return new HATerminalNode(fac.create(1, Byte.toString(b)));
				}    			
			}
			else if(tt == Hammer.TokenType.SINT.getValue())
			{
				return new HATerminalNode(fac.create(2, ""+(char)tok.getSIntValue()));
			}
			else if(tt == Hammer.TokenType.UINT.getValue())
			{
				return new HATerminalNode(fac.create(3, ""+(char)tok.getUIntValue()));
			}
			else if(tt == Hammer.TokenType.SEQUENCE.getValue())
			{
				ParsedToken[] seq = tok.getSeqValue();
				HAParseTree pt = new HARuleNode( new HARuleContext( HTMLRedTreeHelper.RuleType.RT_Undefined.ordinal() ) );
				
				for( int i = seq.length-1; i >= 0; i-- )
				{
					HAParseTree child = generateParseTree(seq[i]);
				   
					if( child.getPayload() instanceof HARuleContext && 
					  ((HARuleContext)child.getPayload()).getRuleIndex() == HTMLRedTreeHelper.RuleType.RT_Undefined.ordinal() )
					{   
						for( int j = child.getChildCount()-1; j >= 0; j-- )
						{
							pt.addChild((HAParseTree)child.getChild(j));
						}
					}
					else
					{
						pt.addChild(child);
					}
				}
				return pt;
			}
			else if(tt == Hammer.TokenType.ERR.getValue())
			{
				System.out.println("An error occured!"); 
			}
			else if(tt >= Hammer.TokenType.USER.getValue())
			{
				if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_Undefined.getValue())
				{
					return buildRuleTree(tok, HTMLRedTreeHelper.RuleType.RT_Undefined.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_P.getValue())
				{
					return buildRuleTree(tok, HTMLRedTreeHelper.RuleType.RT_P.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_Alternatives.getValue())
				{
					return buildRuleTree(tok, HTMLRedTreeHelper.RuleType.RT_Alternatives.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_B.getValue())
				{
					return buildRuleTree(tok, HTMLRedTreeHelper.RuleType.RT_B.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_I.getValue())
				{
					return buildRuleTree(tok, HTMLRedTreeHelper.RuleType.RT_I.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_1.getValue())
				{
					return buildStringTree(tok, HTMLRedTreeHelper.TokenType.TT_1.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_2.getValue())
				{
					return buildStringTree(tok, HTMLRedTreeHelper.TokenType.TT_2.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_3.getValue())
				{
					return buildStringTree(tok, HTMLRedTreeHelper.TokenType.TT_3.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_4.getValue())
				{
					return buildStringTree(tok, HTMLRedTreeHelper.TokenType.TT_4.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_5.getValue())
				{
					return buildStringTree(tok, HTMLRedTreeHelper.TokenType.TT_5.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_6.getValue())
				{
					return buildStringTree(tok, HTMLRedTreeHelper.TokenType.TT_6.ordinal());
				}
				else if(tt == HTMLRedTreeHelper.UserTokenTypes.UTT_TEXTB.getValue())
				{
					return buildStringTree(tok, HTMLRedTreeHelper.TokenType.TT_TEXTB.ordinal());
				}
				else
				{
					System.out.println("User"); 
				}
			}    		
		}

		return new HATerminalNode(fac.create(0, ""));    	
	}
	
	private static HAParseTree buildRuleTree(ParsedToken tok, int tokenType)
	{
		ParsedToken[] seq = tok.getSeqValue();
		HAParseTree pt = new HARuleNode( new HARuleContext( tokenType ) );
	       
		for( int i = seq.length-1; i >= 0; i-- )
		{
			HAParseTree child = generateParseTree(seq[i]);
			
			if( child.getPayload() instanceof HARuleContext && 
			   ((HARuleContext)child.getPayload()).getRuleIndex() == HTMLRedTreeHelper.RuleType.RT_Undefined.ordinal() )
			{
				for( int j = child.getChildCount()-1; j >= 0; j-- )
				{
					pt.addChild((HAParseTree)child.getChild(j));
				}
			}
			else
			{
			    pt.addChild(child);
		    }
	    }
		   
	    return pt;
	}
	
	private static HAParseTree buildStringTree(ParsedToken tok, int tokenType)
	{
		CommonTokenFactory fac = new CommonTokenFactory();
		
		ParsedToken[] seq = tok.getSeqValue();
		    
		String text = new String();
		for( int i = 0; i < seq.length; i++ )
		{
			HAParseTree child = generateParseTree(seq[i]);
			
			text += child.getText();
		}
		
		HAParseTree pt = new HATerminalNode( fac.create(tokenType, text) );
		   
		return pt;
	}
}