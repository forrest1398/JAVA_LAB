import org.assertj.core.api.Assertions;
import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("filter 테스트")
    public void filterTest() {
        int a = 3;
        int b = 4;
        Main main = new Main();
        Assertions.assertThat(main.filterExample().get(0)).isEqualTo(a);
        Assertions.assertThat(main.filterExample().get(1)).isEqualTo(b);
    }

    @Test
    @DisplayName("find first 테스트")
    public void findFirstTest() {
        int a = 3;
        Main main = new Main();
        Assertions.assertThat(main.findFirstExample()).isEqualTo(a);
    }

    @Test
    @DisplayName("for each 테스트")
    public void forEachTest() {
        int a = 3;
        Main main = new Main();
        for (int i = 0; i < 5; i++) {
            Assertions.assertThat(main.forEachExample().get(i)).isEqualTo(i + 1);
        }


    }

    @Test
    @DisplayName("map 테스트")
    public void mapTest() {
        Main main = new Main();
        Assertions.assertThat(main.mapExample().get(0).getClass().getName()).isEqualTo("String");
    }

    @Test
    @DisplayName("all match 테스트")
    public void allMatchTest() {
        Main main = new Main();
        Assertions.assertThat(main.allMatchExample()).isEqualTo(true);
    }

    @Test
    @DisplayName("any match 테스트")
    public void anyMatchTest() {
        Main main = new Main();
        Assertions.assertThat(main.anyMatchExample()).isEqualTo(true);
    }

    @Test
    @DisplayName("none match 테스트")
    public void noneMatchTest() {
        Main main = new Main();
        Assertions.assertThat(main.noneMatchExample()).isEqualTo(true);
    }

    @Test
    @DisplayName("count 테스트")
    public void countTest() {
        Main main = new Main();
        Assertions.assertThat(main.countExample()).isEqualTo(10);
    }

    @Test
    @DisplayName("distinct 테스트")
    public void distinctTest() {
        Main main = new Main();
        Assertions.assertThat(main.distinctExample().size()).isEqualTo(1);
    }

}
