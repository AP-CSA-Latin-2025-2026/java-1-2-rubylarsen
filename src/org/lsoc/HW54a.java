public class HW54a {
  public static void main(String[] args) {
    int VW_bug_miles = 286;
    int VW_bug_gallons = 9;
    int VW_bug_m_per_g = VW_bug_miles / VW_bug_gallons;

    int Firebird_miles = 412;
    int Firebird_gallons = 40;
    int Firebird_m_per_g = Firebird_miles / Firebird_gallons;

    int Subaru_miles = 361;
    int Subaru_gallons = 18;
    int Subaru_m_per_g = Subaru_miles / Subaru_gallons;

    int Cutlass_miles = 161;
    int Cutlass_gallons = 11;
    int Cutlass_m_per_g = Cutlass_miles /Cutlass_gallons;
    
    System.out.println(VW_bug_m_per_g);
    System.out.println(Firebird_m_per_g);
    System.out.println(Subaru_m_per_g);
    System.out.println(Cutlass_m_per_g);
  }

}