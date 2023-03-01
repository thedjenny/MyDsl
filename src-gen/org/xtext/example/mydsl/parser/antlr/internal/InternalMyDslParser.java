package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?xml version = \"1.0\" encoding = \"UTF-16\"?>'", "'<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->'", "'<documents>'", "'<document Name='", "' DiagramType='", "'>'", "'</document>'", "'</documents>'", "'</netlist>'", "'<layer Name='", "' Visible=\"true\" Simulated=\"true\" Locked=\"false\"'", "'</layer>'", "'<component ComponentID='", "' IDA='", "' IDF='", "' IDT='", "'</component>'", "'<variable_type Name='", "'</variable_type>'", "'<t'", "' Name='", "'</t'", "'<nodes>'", "'</nodes>'", "'<node Name='", "' Technology=\"Bloc\">'", "'</node>'", "'<link CompID='", "' PortID='", "' PortName='", "' PortDirection='", "'/>'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExportModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExportModel"
    // InternalMyDsl.g:64:1: entryRuleExportModel returns [EObject current=null] : iv_ruleExportModel= ruleExportModel EOF ;
    public final EObject entryRuleExportModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportModel = null;


        try {
            // InternalMyDsl.g:64:52: (iv_ruleExportModel= ruleExportModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleExportModel= ruleExportModel EOF
            {
             newCompositeNode(grammarAccess.getExportModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportModel=ruleExportModel();

            state._fsp--;

             current =iv_ruleExportModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExportModel"


    // $ANTLR start "ruleExportModel"
    // InternalMyDsl.g:71:1: ruleExportModel returns [EObject current=null] : (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) ) ;
    public final EObject ruleExportModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_export_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) ) )
            // InternalMyDsl.g:78:2: (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) )
            // InternalMyDsl.g:79:3: otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExportModelAccess().getXmlVersion10EncodingUTF16Keyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_export_1_0= ruleNetlistType ) )
            // InternalMyDsl.g:84:4: (lv_export_1_0= ruleNetlistType )
            {
            // InternalMyDsl.g:84:4: (lv_export_1_0= ruleNetlistType )
            // InternalMyDsl.g:85:5: lv_export_1_0= ruleNetlistType
            {

            					newCompositeNode(grammarAccess.getExportModelAccess().getExportNetlistTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_export_1_0=ruleNetlistType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportModelRule());
            					}
            					set(
            						current,
            						"export",
            						lv_export_1_0,
            						"org.xtext.example.mydsl.MyDsl.NetlistType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExportModel"


    // $ANTLR start "entryRuleNetlistType"
    // InternalMyDsl.g:106:1: entryRuleNetlistType returns [EObject current=null] : iv_ruleNetlistType= ruleNetlistType EOF ;
    public final EObject entryRuleNetlistType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetlistType = null;


        try {
            // InternalMyDsl.g:106:52: (iv_ruleNetlistType= ruleNetlistType EOF )
            // InternalMyDsl.g:107:2: iv_ruleNetlistType= ruleNetlistType EOF
            {
             newCompositeNode(grammarAccess.getNetlistTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetlistType=ruleNetlistType();

            state._fsp--;

             current =iv_ruleNetlistType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetlistType"


    // $ANTLR start "ruleNetlistType"
    // InternalMyDsl.g:113:1: ruleNetlistType returns [EObject current=null] : ( (otherlv_0= '<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->' )? otherlv_1= '<documents>' otherlv_2= '<document Name=' ( (lv_docname_3_0= RULE_STRING ) ) (otherlv_4= ' DiagramType=' ( (lv_doctype_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( (lv_layer_7_0= ruleLayer ) )* otherlv_8= '</document>' otherlv_9= '</documents>' ( (lv_nodes_10_0= ruleNodes ) ) otherlv_11= '</netlist>' ) ;
    public final EObject ruleNetlistType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_docname_3_0=null;
        Token otherlv_4=null;
        Token lv_doctype_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_layer_7_0 = null;

        EObject lv_nodes_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:119:2: ( ( (otherlv_0= '<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->' )? otherlv_1= '<documents>' otherlv_2= '<document Name=' ( (lv_docname_3_0= RULE_STRING ) ) (otherlv_4= ' DiagramType=' ( (lv_doctype_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( (lv_layer_7_0= ruleLayer ) )* otherlv_8= '</document>' otherlv_9= '</documents>' ( (lv_nodes_10_0= ruleNodes ) ) otherlv_11= '</netlist>' ) )
            // InternalMyDsl.g:120:2: ( (otherlv_0= '<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->' )? otherlv_1= '<documents>' otherlv_2= '<document Name=' ( (lv_docname_3_0= RULE_STRING ) ) (otherlv_4= ' DiagramType=' ( (lv_doctype_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( (lv_layer_7_0= ruleLayer ) )* otherlv_8= '</document>' otherlv_9= '</documents>' ( (lv_nodes_10_0= ruleNodes ) ) otherlv_11= '</netlist>' )
            {
            // InternalMyDsl.g:120:2: ( (otherlv_0= '<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->' )? otherlv_1= '<documents>' otherlv_2= '<document Name=' ( (lv_docname_3_0= RULE_STRING ) ) (otherlv_4= ' DiagramType=' ( (lv_doctype_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( (lv_layer_7_0= ruleLayer ) )* otherlv_8= '</document>' otherlv_9= '</documents>' ( (lv_nodes_10_0= ruleNodes ) ) otherlv_11= '</netlist>' )
            // InternalMyDsl.g:121:3: (otherlv_0= '<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->' )? otherlv_1= '<documents>' otherlv_2= '<document Name=' ( (lv_docname_3_0= RULE_STRING ) ) (otherlv_4= ' DiagramType=' ( (lv_doctype_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( (lv_layer_7_0= ruleLayer ) )* otherlv_8= '</document>' otherlv_9= '</documents>' ( (lv_nodes_10_0= ruleNodes ) ) otherlv_11= '</netlist>'
            {
            // InternalMyDsl.g:121:3: (otherlv_0= '<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:122:4: otherlv_0= '<netlist xmlns=\"urn:netlist-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >\\r\\n\\t<!--Famic Technologies Inc.-->\\r\\n\\t<!--Automation Studio-->\\r\\n\\t<!--Export-->'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getNetlistTypeAccess().getNetlistXmlnsUrnNetlistSchemaXmlnsXsiHttpWwwW3Org2001XMLSchemaInstanceXsiSchemaLocationUrnNetlistSchemaValidationRulesXsdFamicTechnologiesIncAutomationStudioExportKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNetlistTypeAccess().getDocumentsKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNetlistTypeAccess().getDocumentNameKeyword_2());
            		
            // InternalMyDsl.g:135:3: ( (lv_docname_3_0= RULE_STRING ) )
            // InternalMyDsl.g:136:4: (lv_docname_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:136:4: (lv_docname_3_0= RULE_STRING )
            // InternalMyDsl.g:137:5: lv_docname_3_0= RULE_STRING
            {
            lv_docname_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_docname_3_0, grammarAccess.getNetlistTypeAccess().getDocnameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetlistTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"docname",
            						lv_docname_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:153:3: (otherlv_4= ' DiagramType=' ( (lv_doctype_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:154:4: otherlv_4= ' DiagramType=' ( (lv_doctype_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getNetlistTypeAccess().getDiagramTypeKeyword_4_0());
                    			
                    // InternalMyDsl.g:158:4: ( (lv_doctype_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:159:5: (lv_doctype_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:159:5: (lv_doctype_5_0= RULE_STRING )
                    // InternalMyDsl.g:160:6: lv_doctype_5_0= RULE_STRING
                    {
                    lv_doctype_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_doctype_5_0, grammarAccess.getNetlistTypeAccess().getDoctypeSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNetlistTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"doctype",
                    							lv_doctype_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getNetlistTypeAccess().getGreaterThanSignKeyword_5());
            		
            // InternalMyDsl.g:181:3: ( (lv_layer_7_0= ruleLayer ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:182:4: (lv_layer_7_0= ruleLayer )
            	    {
            	    // InternalMyDsl.g:182:4: (lv_layer_7_0= ruleLayer )
            	    // InternalMyDsl.g:183:5: lv_layer_7_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getNetlistTypeAccess().getLayerLayerParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_layer_7_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNetlistTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layer",
            	    						lv_layer_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getNetlistTypeAccess().getDocumentKeyword_7());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getNetlistTypeAccess().getDocumentsKeyword_8());
            		
            // InternalMyDsl.g:208:3: ( (lv_nodes_10_0= ruleNodes ) )
            // InternalMyDsl.g:209:4: (lv_nodes_10_0= ruleNodes )
            {
            // InternalMyDsl.g:209:4: (lv_nodes_10_0= ruleNodes )
            // InternalMyDsl.g:210:5: lv_nodes_10_0= ruleNodes
            {

            					newCompositeNode(grammarAccess.getNetlistTypeAccess().getNodesNodesParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_nodes_10_0=ruleNodes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetlistTypeRule());
            					}
            					set(
            						current,
            						"nodes",
            						lv_nodes_10_0,
            						"org.xtext.example.mydsl.MyDsl.Nodes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNetlistTypeAccess().getNetlistKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetlistType"


    // $ANTLR start "entryRuleLayer"
    // InternalMyDsl.g:235:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalMyDsl.g:235:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalMyDsl.g:236:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalMyDsl.g:242:1: ruleLayer returns [EObject current=null] : (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_coucheName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_components_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:248:2: ( (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' ) )
            // InternalMyDsl.g:249:2: (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' )
            {
            // InternalMyDsl.g:249:2: (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' )
            // InternalMyDsl.g:250:3: otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerNameKeyword_0());
            		
            // InternalMyDsl.g:254:3: ( (lv_coucheName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:255:4: (lv_coucheName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:255:4: (lv_coucheName_1_0= RULE_STRING )
            // InternalMyDsl.g:256:5: lv_coucheName_1_0= RULE_STRING
            {
            lv_coucheName_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_coucheName_1_0, grammarAccess.getLayerAccess().getCoucheNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"coucheName",
            						lv_coucheName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:272:3: (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:273:4: otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getVisibleTrueSimulatedTrueLockedFalseKeyword_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:282:3: ( (lv_components_4_0= ruleComponent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:283:4: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalMyDsl.g:283:4: (lv_components_4_0= ruleComponent )
            	    // InternalMyDsl.g:284:5: lv_components_4_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getLayerAccess().getComponentsComponentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getLayerKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleComponent"
    // InternalMyDsl.g:309:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMyDsl.g:309:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMyDsl.g:310:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMyDsl.g:316:1: ruleComponent returns [EObject current=null] : (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compoId_1_0=null;
        Token otherlv_2=null;
        Token lv_compoIda_3_0=null;
        Token otherlv_4=null;
        Token lv_compoIdf_5_0=null;
        Token otherlv_6=null;
        Token lv_compoIdt_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_vars_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:322:2: ( (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' ) )
            // InternalMyDsl.g:323:2: (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' )
            {
            // InternalMyDsl.g:323:2: (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' )
            // InternalMyDsl.g:324:3: otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentComponentIDKeyword_0());
            		
            // InternalMyDsl.g:328:3: ( (lv_compoId_1_0= RULE_STRING ) )
            // InternalMyDsl.g:329:4: (lv_compoId_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:329:4: (lv_compoId_1_0= RULE_STRING )
            // InternalMyDsl.g:330:5: lv_compoId_1_0= RULE_STRING
            {
            lv_compoId_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_compoId_1_0, grammarAccess.getComponentAccess().getCompoIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoId",
            						lv_compoId_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getIDAKeyword_2());
            		
            // InternalMyDsl.g:350:3: ( (lv_compoIda_3_0= RULE_STRING ) )
            // InternalMyDsl.g:351:4: (lv_compoIda_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:351:4: (lv_compoIda_3_0= RULE_STRING )
            // InternalMyDsl.g:352:5: lv_compoIda_3_0= RULE_STRING
            {
            lv_compoIda_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_compoIda_3_0, grammarAccess.getComponentAccess().getCompoIdaSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoIda",
            						lv_compoIda_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getIDFKeyword_4());
            		
            // InternalMyDsl.g:372:3: ( (lv_compoIdf_5_0= RULE_STRING ) )
            // InternalMyDsl.g:373:4: (lv_compoIdf_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:373:4: (lv_compoIdf_5_0= RULE_STRING )
            // InternalMyDsl.g:374:5: lv_compoIdf_5_0= RULE_STRING
            {
            lv_compoIdf_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_compoIdf_5_0, grammarAccess.getComponentAccess().getCompoIdfSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoIdf",
            						lv_compoIdf_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getIDTKeyword_6());
            		
            // InternalMyDsl.g:394:3: ( (lv_compoIdt_7_0= RULE_STRING ) )
            // InternalMyDsl.g:395:4: (lv_compoIdt_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:395:4: (lv_compoIdt_7_0= RULE_STRING )
            // InternalMyDsl.g:396:5: lv_compoIdt_7_0= RULE_STRING
            {
            lv_compoIdt_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_compoIdt_7_0, grammarAccess.getComponentAccess().getCompoIdtSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoIdt",
            						lv_compoIdt_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getGreaterThanSignKeyword_8());
            		
            // InternalMyDsl.g:416:3: ( (lv_vars_9_0= ruleVariable ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:417:4: (lv_vars_9_0= ruleVariable )
            	    {
            	    // InternalMyDsl.g:417:4: (lv_vars_9_0= ruleVariable )
            	    // InternalMyDsl.g:418:5: lv_vars_9_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getVarsVariableParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_vars_9_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getComponentKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:443:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:443:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:444:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:450:1: ruleVariable returns [EObject current=null] : (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tags_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:456:2: ( (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' ) )
            // InternalMyDsl.g:457:2: (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' )
            {
            // InternalMyDsl.g:457:2: (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' )
            // InternalMyDsl.g:458:3: otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariable_typeNameKeyword_0());
            		
            // InternalMyDsl.g:462:3: ( (lv_varName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:463:4: (lv_varName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:463:4: (lv_varName_1_0= RULE_STRING )
            // InternalMyDsl.g:464:5: lv_varName_1_0= RULE_STRING
            {
            lv_varName_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVariableAccess().getVarNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getGreaterThanSignKeyword_2());
            		
            // InternalMyDsl.g:484:3: ( (lv_tags_3_0= ruleTag ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:485:4: (lv_tags_3_0= ruleTag )
            	    {
            	    // InternalMyDsl.g:485:4: (lv_tags_3_0= ruleTag )
            	    // InternalMyDsl.g:486:5: lv_tags_3_0= ruleTag
            	    {

            	    					newCompositeNode(grammarAccess.getVariableAccess().getTagsTagParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_tags_3_0=ruleTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVariableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tags",
            	    						lv_tags_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Tag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getVariable_typeKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTag"
    // InternalMyDsl.g:511:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalMyDsl.g:511:44: (iv_ruleTag= ruleTag EOF )
            // InternalMyDsl.g:512:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalMyDsl.g:518:1: ruleTag returns [EObject current=null] : (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tagNum_1_0=null;
        Token otherlv_2=null;
        Token lv_tagName_3_0=null;
        Token otherlv_4=null;
        Token lv_var_5_0=null;
        Token this_STRING_6=null;
        Token this_INT_7=null;
        Token otherlv_8=null;
        Token lv_tagNum_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:524:2: ( (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' ) )
            // InternalMyDsl.g:525:2: (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' )
            {
            // InternalMyDsl.g:525:2: (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' )
            // InternalMyDsl.g:526:3: otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getTKeyword_0());
            		
            // InternalMyDsl.g:530:3: ( (lv_tagNum_1_0= RULE_INT ) )
            // InternalMyDsl.g:531:4: (lv_tagNum_1_0= RULE_INT )
            {
            // InternalMyDsl.g:531:4: (lv_tagNum_1_0= RULE_INT )
            // InternalMyDsl.g:532:5: lv_tagNum_1_0= RULE_INT
            {
            lv_tagNum_1_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_tagNum_1_0, grammarAccess.getTagAccess().getTagNumINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tagNum",
            						lv_tagNum_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTagAccess().getNameKeyword_2());
            		
            // InternalMyDsl.g:552:3: ( (lv_tagName_3_0= RULE_STRING ) )
            // InternalMyDsl.g:553:4: (lv_tagName_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:553:4: (lv_tagName_3_0= RULE_STRING )
            // InternalMyDsl.g:554:5: lv_tagName_3_0= RULE_STRING
            {
            lv_tagName_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_tagName_3_0, grammarAccess.getTagAccess().getTagNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tagName",
            						lv_tagName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getTagAccess().getGreaterThanSignKeyword_4());
            		
            // InternalMyDsl.g:574:3: ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )?
            int alt8=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt8=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_INT:
                    {
                    alt8=3;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:575:4: ( (lv_var_5_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:575:4: ( (lv_var_5_0= RULE_ID ) )
                    // InternalMyDsl.g:576:5: (lv_var_5_0= RULE_ID )
                    {
                    // InternalMyDsl.g:576:5: (lv_var_5_0= RULE_ID )
                    // InternalMyDsl.g:577:6: lv_var_5_0= RULE_ID
                    {
                    lv_var_5_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_var_5_0, grammarAccess.getTagAccess().getVarIDTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var",
                    							lv_var_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:594:4: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    				newLeafNode(this_STRING_6, grammarAccess.getTagAccess().getSTRINGTerminalRuleCall_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:599:4: this_INT_7= RULE_INT
                    {
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_23); 

                    				newLeafNode(this_INT_7, grammarAccess.getTagAccess().getINTTerminalRuleCall_5_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getTagAccess().getTKeyword_6());
            		
            // InternalMyDsl.g:608:3: ( (lv_tagNum_9_0= RULE_INT ) )
            // InternalMyDsl.g:609:4: (lv_tagNum_9_0= RULE_INT )
            {
            // InternalMyDsl.g:609:4: (lv_tagNum_9_0= RULE_INT )
            // InternalMyDsl.g:610:5: lv_tagNum_9_0= RULE_INT
            {
            lv_tagNum_9_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_tagNum_9_0, grammarAccess.getTagAccess().getTagNumINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tagNum",
            						lv_tagNum_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTagAccess().getGreaterThanSignKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleNodes"
    // InternalMyDsl.g:634:1: entryRuleNodes returns [EObject current=null] : iv_ruleNodes= ruleNodes EOF ;
    public final EObject entryRuleNodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodes = null;


        try {
            // InternalMyDsl.g:634:46: (iv_ruleNodes= ruleNodes EOF )
            // InternalMyDsl.g:635:2: iv_ruleNodes= ruleNodes EOF
            {
             newCompositeNode(grammarAccess.getNodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodes=ruleNodes();

            state._fsp--;

             current =iv_ruleNodes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodes"


    // $ANTLR start "ruleNodes"
    // InternalMyDsl.g:641:1: ruleNodes returns [EObject current=null] : (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' ) ;
    public final EObject ruleNodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:647:2: ( (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' ) )
            // InternalMyDsl.g:648:2: (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' )
            {
            // InternalMyDsl.g:648:2: (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' )
            // InternalMyDsl.g:649:3: otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getNodesAccess().getNodesKeyword_0());
            		
            // InternalMyDsl.g:653:3: ( (lv_nodes_1_0= ruleNode ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:654:4: (lv_nodes_1_0= ruleNode )
            	    {
            	    // InternalMyDsl.g:654:4: (lv_nodes_1_0= ruleNode )
            	    // InternalMyDsl.g:655:5: lv_nodes_1_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getNodesAccess().getNodesNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_nodes_1_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNodesAccess().getNodesKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodes"


    // $ANTLR start "entryRuleNode"
    // InternalMyDsl.g:680:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMyDsl.g:680:45: (iv_ruleNode= ruleNode EOF )
            // InternalMyDsl.g:681:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMyDsl.g:687:1: ruleNode returns [EObject current=null] : (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nodeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_links_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:693:2: ( (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' ) )
            // InternalMyDsl.g:694:2: (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' )
            {
            // InternalMyDsl.g:694:2: (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' )
            // InternalMyDsl.g:695:3: otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeNameKeyword_0());
            		
            // InternalMyDsl.g:699:3: ( (lv_nodeName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:700:4: (lv_nodeName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:700:4: (lv_nodeName_1_0= RULE_STRING )
            // InternalMyDsl.g:701:5: lv_nodeName_1_0= RULE_STRING
            {
            lv_nodeName_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_nodeName_1_0, grammarAccess.getNodeAccess().getNodeNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodeName",
            						lv_nodeName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getTechnologyBlocKeyword_2());
            		
            // InternalMyDsl.g:721:3: ( (lv_links_3_0= ruleLink ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:722:4: (lv_links_3_0= ruleLink )
            	    {
            	    // InternalMyDsl.g:722:4: (lv_links_3_0= ruleLink )
            	    // InternalMyDsl.g:723:5: lv_links_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getLinksLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_links_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getNodeKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:748:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:748:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:749:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:755:1: ruleLink returns [EObject current=null] : (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CompID_1_0=null;
        Token otherlv_2=null;
        Token lv_portID_3_0=null;
        Token otherlv_4=null;
        Token lv_portName_5_0=null;
        Token otherlv_6=null;
        Token lv_portName2_7_0=null;
        AntlrDatatypeRuleToken lv_baliseFermante_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:761:2: ( (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) ) )
            // InternalMyDsl.g:762:2: (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) )
            {
            // InternalMyDsl.g:762:2: (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) )
            // InternalMyDsl.g:763:3: otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkCompIDKeyword_0());
            		
            // InternalMyDsl.g:767:3: ( (lv_CompID_1_0= RULE_STRING ) )
            // InternalMyDsl.g:768:4: (lv_CompID_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:768:4: (lv_CompID_1_0= RULE_STRING )
            // InternalMyDsl.g:769:5: lv_CompID_1_0= RULE_STRING
            {
            lv_CompID_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_CompID_1_0, grammarAccess.getLinkAccess().getCompIDSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CompID",
            						lv_CompID_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getPortIDKeyword_2());
            		
            // InternalMyDsl.g:789:3: ( (lv_portID_3_0= RULE_STRING ) )
            // InternalMyDsl.g:790:4: (lv_portID_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:790:4: (lv_portID_3_0= RULE_STRING )
            // InternalMyDsl.g:791:5: lv_portID_3_0= RULE_STRING
            {
            lv_portID_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_portID_3_0, grammarAccess.getLinkAccess().getPortIDSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portID",
            						lv_portID_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getPortNameKeyword_4());
            		
            // InternalMyDsl.g:811:3: ( (lv_portName_5_0= RULE_STRING ) )
            // InternalMyDsl.g:812:4: (lv_portName_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:812:4: (lv_portName_5_0= RULE_STRING )
            // InternalMyDsl.g:813:5: lv_portName_5_0= RULE_STRING
            {
            lv_portName_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_portName_5_0, grammarAccess.getLinkAccess().getPortNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portName",
            						lv_portName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getPortDirectionKeyword_6());
            		
            // InternalMyDsl.g:833:3: ( (lv_portName2_7_0= RULE_STRING ) )
            // InternalMyDsl.g:834:4: (lv_portName2_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:834:4: (lv_portName2_7_0= RULE_STRING )
            // InternalMyDsl.g:835:5: lv_portName2_7_0= RULE_STRING
            {
            lv_portName2_7_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_portName2_7_0, grammarAccess.getLinkAccess().getPortName2STRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portName2",
            						lv_portName2_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:851:3: ( (lv_baliseFermante_8_0= ruleBalise ) )
            // InternalMyDsl.g:852:4: (lv_baliseFermante_8_0= ruleBalise )
            {
            // InternalMyDsl.g:852:4: (lv_baliseFermante_8_0= ruleBalise )
            // InternalMyDsl.g:853:5: lv_baliseFermante_8_0= ruleBalise
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getBaliseFermanteBaliseParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_baliseFermante_8_0=ruleBalise();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"baliseFermante",
            						lv_baliseFermante_8_0,
            						"org.xtext.example.mydsl.MyDsl.Balise");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleBalise"
    // InternalMyDsl.g:874:1: entryRuleBalise returns [String current=null] : iv_ruleBalise= ruleBalise EOF ;
    public final String entryRuleBalise() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBalise = null;


        try {
            // InternalMyDsl.g:874:46: (iv_ruleBalise= ruleBalise EOF )
            // InternalMyDsl.g:875:2: iv_ruleBalise= ruleBalise EOF
            {
             newCompositeNode(grammarAccess.getBaliseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBalise=ruleBalise();

            state._fsp--;

             current =iv_ruleBalise.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBalise"


    // $ANTLR start "ruleBalise"
    // InternalMyDsl.g:881:1: ruleBalise returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/>' ;
    public final AntlrDatatypeRuleToken ruleBalise() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:887:2: (kw= '/>' )
            // InternalMyDsl.g:888:2: kw= '/>'
            {
            kw=(Token)match(input,42,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBaliseAccess().getSolidusGreaterThanSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBalise"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});

}