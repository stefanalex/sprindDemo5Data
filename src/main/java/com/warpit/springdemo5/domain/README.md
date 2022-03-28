# javax.persistence.OneToOne
Specifies a single-valued association to another entity that hasone-to-one multiplicity. 
It is not normally necessary to specify the associated target entity explicitly since
it can usually be inferred from the type of the object being referenced. 
If the relationship is bidirectional, the non-owning side must use the mappedBy element of the OneToOne annotation to specify the relationship field or property of the owning side. 

The OneToOne annotation may be used within an embeddable class to specify a relationship from the embeddable class to an entity class.
 If the relationship is bidirectional and the entity containing the embeddable class is on the owning side of the relationship, 
 the non-owning side must use the mappedBy element of the OneToOneannotation to specify the relationship field or property of the embeddable class. The dot (".") notation syntax must be used in the mappedBy element to indicate the relationship attribute within the embedded attribute. 
 The value of each identifier used with the dot notation is the name of the respective embedded field or property. 
    Example 1: One-to-one association that maps a foreign key column

    // On Customer class:

    @OneToOne(optional=false)
    @JoinColumn(
    	name="CUSTREC_ID", unique=true, nullable=false, updatable=false)
    public CustomerRecord getCustomerRecord() { return customerRecord; }

    // On CustomerRecord class:

    @OneToOne(optional=false, mappedBy="customerRecord")
    public Customer getCustomer() { return customer; }


    Example 2: One-to-one association that assumes both the source and target share the same primary key values. 

    // On Employee class:

    @Entity
    public class Employee {
    	@Id Integer id;
    
    	@OneToOne @MapsId
    	EmployeeInfo info;
    	...
    }

    // On EmployeeInfo class:

    @Entity
    public class EmployeeInfo {
    	@Id Integer id;
    	...
    }


    Example 3: One-to-one association from an embeddable class to another entity.

    @Entity
    public class Employee {
       @Id int id;
       @Embedded LocationDetails location;
       ...
    }

    @Embeddable
    public class LocationDetails {
       int officeNumber;
       @OneToOne ParkingSpot parkingSpot;
       ...
    }

    @Entity
    public class ParkingSpot {
       @Id int id;
       String garage;
       @OneToOne(mappedBy="location.parkingSpot") Employee assignedTo;
        ... 
    } 

