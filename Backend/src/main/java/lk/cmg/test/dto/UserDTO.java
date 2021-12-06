package lk.cmg.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lahiru Chanaka <chankalahiru69@gmail.com>
 * @since 12/3/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String name;
    private String username;
    private String mobile_number;
    private String dob;
    private String gender;
    private String language;
    private String password;
}
