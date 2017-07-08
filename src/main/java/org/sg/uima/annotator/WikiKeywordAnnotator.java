package org.sg.uima.annotator;

import static org.apache.uima.fit.util.JCasUtil.select;

import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent.ROOT;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;

import cz.brmlab.yodaqa.model.Question.Focus;
import cz.brmlab.yodaqa.model.Question.Subject;

import org.sg.uima.annotator.WikiKeywordAnnotator;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.ADV;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent.Constituent;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent.ROOT;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.ADVMOD;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.DEP;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.DET;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.DOBJ;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.NSUBJ;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.NSUBJPASS;


public class WikiKeywordAnnotator extends JCasAnnotator_ImplBase {

	public  void process(JCas aJCas) throws AnalysisEngineProcessException {
    
    String docText = aJCas.getDocumentText();
    System.out.println("\n\n");
    System.out.println("Annotator Text : "+docText);
    System.out.println("\n\n");
    
    System.out.println("ROOT are: \n");
    for (ROOT sentence : JCasUtil.select(aJCas, ROOT.class)) {
    	System.out.print(sentence.getCoveredText()+"\n");
	}
    System.out.println("\n\n");
    
    System.out.println("NSUBJ are: \n");
    for (NSUBJ sentence : JCasUtil.select(aJCas, NSUBJ.class)) {
    	System.out.print(sentence.getCoveredText()+"\n");
	}
    System.out.println("\n\n");
    
    System.out.println("NSUBJPASS are: \n");
    for (NSUBJPASS sentence : JCasUtil.select(aJCas, NSUBJPASS.class)) {
    	System.out.print(sentence.getCoveredText()+"\n");
	}
    System.out.println("\n\n");
    
    System.out.println("Subject are: \n");
    for (Subject sentence : JCasUtil.select(aJCas, Subject.class)) {
    	System.out.print(sentence.getCoveredText()+"\n");
	}
    System.out.println("\n\n");
   


  }
}