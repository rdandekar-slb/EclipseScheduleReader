import java.nio.file.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Path p=Path.of("GASWATER.DATA");
    try {
    String filecontents=Files.readString(p);
    //System.out.println(filecontents);
    String[] s=filecontents.split("\n");
    System.out.println(s.length);
    for(int i=0;i<s.length;i++){
      System.out.println(s[i]);
    }
    }
    catch (Exception e){
      System.out.println(e);
    }
  }
}


class WELSPECS{
  enum WellPreferredPhases{
    OIL, WATER, GAS, LIQ
  }
  enum WellSpecialInflowEquations{
    STD, NO, R_G, YES, P_P, GPP
  }
  public String WellName;
  public String Group;
  public int I;
  public int J;
  public double ReferenceDepth;
  public String PreferredPhase;
  public double DrainageRadius;
  public String SpecialInflowEquation;
  public 
}

class WCONPROD{
enum WellControlModes{
  ORAT, WRAT, GRAT, LRAT, CRAT, RESV, BHP, THP, WGRA, TMRA, STRA, SATP, SATT, CVAL, NGL, GRUP
}
enum WellOpenModes{
  OPEN, STOP, SHUT,AUTO
}
public String WellName;
public String OpenShut;
public String ControlMode;
public double OilRateTarget;
public double WaterRateTarget;
public double GasRateTarget;
public double LiquidRateTarget;
public double ReservoirVolumeRateTarget;
public double BHPTarget;
public double THPTarget;
public int VFPTableNumber;
public double ArtificialLiftQuantity;
public double WetGasProductionRateTarget;
public double TotalMolarRateTarget;
public double SteamProductionRateTarget;
public double SaturationPressureOffset;
public double SaturationTemperatureOffset;
public double CalorificRateTarget;
public double LinearlyCombinedRateTarget;
public double NGLRateTarget;

}