import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import rules.Fact;
import rules.Fact2;

public class FireAllRules {
    
    public static void main(String[] args){
        
        Fact2 fact = new Fact2();
        // load up the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");
        kSession.insert(fact);
        //fire rules
        kSession.fireAllRules();
    }
    
}
