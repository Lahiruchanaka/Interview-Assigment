package lk.cmg.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Lahiru Chanaka <chankalahiru69@gmail.com>
 * @since 12/3/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="users")
public class User {
    @Id
    private String id;
    private String name;
    private String username;
    private String mobile_number;
    private String dob;
    private String gender;
    private String language;
    private String password;

}
