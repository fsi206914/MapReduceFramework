
public class TestMapper extends Mapper {

  @Override
  public void map(String key, String value, Outputer out) {
    out.collect(key, value);
  }

}
