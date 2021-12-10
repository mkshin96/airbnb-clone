package clone.airbnb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Java17Test {

    @Test
    void 자바17_적용됐는지() {
        Fruit fruit = Fruit.APPLE;

        assertThat(whatsThatFruit(fruit)).isEqualTo("APPLE");
    }

    public String whatsThatFruit(Fruit fruit) {
        String result = switch (fruit) {
            case APPLE -> "APPLE";
            case MELON -> "MELON";
            case BANANA -> "BANANA";
        };

        return result;
    }
}
