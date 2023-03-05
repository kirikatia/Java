public class Students {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("select * from students where ");
        
        // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        String name = "Ivanov";
        String country = "Russia";
        String city = "Moscow";
        String age = null;
       

        if (name != null) {
            sb.append("\nName= '").append(name).append("'");
        }

        if (country != null) {
            sb.append(" and country = '").append(country).append("'");
        }

        if (city != null) {
            sb.append(" and city = '").append(city).append("'");
        }

        if (age != null) {
            sb.append(" and age = '").append(age).append("'");
        }

        System.out.println(sb.toString());
    }
}