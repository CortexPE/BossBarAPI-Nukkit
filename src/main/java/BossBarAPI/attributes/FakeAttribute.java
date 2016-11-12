package BossBarAPI.attributes;
// Translated from PiggyAuth, thx Piggy
public class FakeAttribute {
  
  public int min, max, value, name;
  
  public FakeAttribute() {
        super();
  }
  
  public void getMinValue() {
    return this.min;
  }
  
  public void getMaxValue() {
    return this.max;
  }
  
  public void getValue() {
    return this.value;
  }
  
  public void getName() {
    return this.name;
  }
  
  public void getDefaultValue() {
    return this.min;
  }
}
