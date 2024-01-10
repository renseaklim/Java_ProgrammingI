import java.util.Scanner;
public class TaskThree {
    public void Exercise2(String st){
        int devidedString = st.length() / 3;
        String st1 = st.substring(0, devidedString);
        String st2 = st.substring(devidedString, 2 * devidedString);
        String st3 = st.substring(2 * devidedString, st.length());
        //split the string
        String[] split1_st1 = st1.split("<");
        String[] split1_st2 = st2.split("<");
        String[] split1_st3 = st3.split("<");
        //extract ID number
        String id = split1_st1[0].substring(5, 14);

        //Extract Date of birth
        String dob = split1_st2[0].substring(0,6);
        String date_of_birth = ExtractDob(dob);
        // Extract Gender
        String gender = split1_st2[0].substring(7,8);

        //Extract ExpiredDate
        String exp_date = split1_st2[0].substring(8,14);
        String exp = ExtractExpiredDate(exp_date);

        // Extract FullName
        String fisrtname = split1_st3[0];
        String lastname = split1_st3[2];

        System.out.println(id);
        System.out.println(date_of_birth);
        System.out.println(gender);
        System.out.println(lastname);
        System.out.println(fisrtname);
        System.out.println(exp);
    }
    public String ExtractDob(String st){
        String dob = st.substring(0,6);
        int year = Integer.parseInt(dob.substring(0, 2));
        if (year > 30 && year <= 99){
            year += 1900;
        }
        else{
            year += 2000;
        }
        String month = dob.substring(2, 4);
        String day = dob.substring(4, 6);
        return day + "/" + month + "/" + year;
    }
    public String ExtractExpiredDate(String st){
        String dob = st.substring(0,6);
        int year = Integer.parseInt(dob.substring(0, 2));
        if (year < 20){
            year += 1900;
        }
        else{
            year += 2000;
        }
        String month = dob.substring(2, 4);
        String day = dob.substring(4, 6);
        return day + "/" + month + "/" + year;
    }

    //exercise 1
    public void Exercise1(String st){
        String[] data = st.split(":");
        String newString = data[1];
        System.out.println(newString);
    }
}
