package tn.esprit.spring.entity;




@Entity
@Table(name="Contart")
public class Contract implements Serializable {

	private static final long serialVersionUID= 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTIFY)
	@Column (name= "ref_contrat")
	private String ref_contrat;
	
	
}
