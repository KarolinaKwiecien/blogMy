package pl.karolinakwiecien.blog.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.karolinakwiecien.blog.models.forms.RegisterForm;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String login;
    private String password;
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;

    public UserModel(RegisterForm registerForm){
        login = registerForm.getLogin();
        password = registerForm.getPassword();
        age = registerForm.getAge();
    }

}