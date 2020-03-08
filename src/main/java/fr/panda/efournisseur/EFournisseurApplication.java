package fr.panda.efournisseur;

import fr.panda.efournisseur.entity.Fournisseur;
import fr.panda.efournisseur.dao.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import sun.tools.jar.CommandLine;

@SpringBootApplication
public class EFournisseurApplication implements CommandLineRunner{
    
    @Autowired
    private FournisseurRepository fournisseurRepository;
    
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(final String[] args) {
		SpringApplication.run(EFournisseurApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("On initialise les Fournisseurs : ");
        //Permet d'afficher les id qui sont cachés par défaut : 
        repositoryRestConfiguration.exposeIdsFor(Fournisseur.class);
        
        fournisseurRepository.save(new Fournisseur(null, "Apple", "contact@apple.org"));
        fournisseurRepository.save(new Fournisseur(null, "Sony", "contact@sony.jp"));
        fournisseurRepository.save(new Fournisseur(null, "JoCompany", "contact@jocorp.org"));
        fournisseurRepository.findAll().forEach(fournisseur->{
            System.out.println(fournisseur.getEmail());
        });
        
        
        System.out.println(" ************************************ ");
    }

}
