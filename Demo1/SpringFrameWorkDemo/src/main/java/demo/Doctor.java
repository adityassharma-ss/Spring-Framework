package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
//    public Doctor(String qualification) {
//        this.qualification = qualification; // constructor
//    }

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}'; // to string created
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }



    public void assist() {
        System.out.println("Doctor is helping");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Method Is called.");
    }

    // once an object is created & you want to call anything.
    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct method");
    }
}
