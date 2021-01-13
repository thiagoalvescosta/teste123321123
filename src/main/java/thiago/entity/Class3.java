package thiago.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiByteHeaderSignature;


/**
* Classe que representa a tabela CLASS3
* @generated
*/
@Entity
@Table(name = "\"CLASS3\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("thiago.entity.Class3")
public class Class3 implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "attribute01", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String attribute01;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_class2", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Class2 class2;

    /**
    * @generated
    */
    @Column(name = "attribute03", nullable = true, unique = false, insertable=true, updatable=true)
        
        private byte[] attribute03;

    /**
    * @generated
    */
    @Column(name = "attribute04", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] attribute04;

    /**
    * Construtor
    * @generated
    */
    public Class3(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Class3 setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém attribute01
    * return attribute01
    * @generated
    */
    
    public java.lang.String getAttribute01(){
        return this.attribute01;
    }

    /**
    * Define attribute01
    * @param attribute01 attribute01
    * @generated
    */
    public Class3 setAttribute01(java.lang.String attribute01){
        this.attribute01 = attribute01;
        return this;
    }
    /**
    * Obtém class2
    * return class2
    * @generated
    */
    
    public Class2 getClass2(){
        return this.class2;
    }

    /**
    * Define class2
    * @param class2 class2
    * @generated
    */
    public Class3 setClass2(Class2 class2){
        this.class2 = class2;
        return this;
    }
    /**
    * Obtém attribute03
    * return attribute03
    * @generated
    */
    
    public byte[] getAttribute03(){
        return this.attribute03;
    }

    /**
    * Define attribute03
    * @param attribute03 attribute03
    * @generated
    */
    public Class3 setAttribute03(byte[] attribute03){
        this.attribute03 = attribute03;
        return this;
    }
    /**
    * Obtém attribute04
    * return attribute04
    * @generated
    */
    
    public byte[] getAttribute04(){
        return this.attribute04;
    }

    /**
    * Define attribute04
    * @param attribute04 attribute04
    * @generated
    */
    public Class3 setAttribute04(byte[] attribute04){
        this.attribute04 = attribute04;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Class3 object = (Class3)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}