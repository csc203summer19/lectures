import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(new Integer[] {0, 4, -16, 9, 3});
        
        // To create a stream of the elements in nums:
        Stream<Integer> numStream = nums.stream();

        // To create a stream with every element halved:
        Stream<Double> halvedNums = 
                nums.stream()
                    .map(n -> n / 2.0);

        // NOTE: This doesn't print anything useful -- the stream is still
        //       a stream.
        System.out.println("    " + halvedNums);
        // The stream must be collected into a traditional data structure
        //  first.
        System.out.println("    " + halvedNums.collect(Collectors.toList()));

        // To create a stream of only the positive elements:
        Stream<Integer> positiveNums = 
                nums.stream()
                    .filter(n -> n > 0);

        System.out.println("    " + positiveNums.collect(Collectors.toList()));

        // To compute the product of all elements:
        Optional<Integer> product =
                nums.stream()
                    .reduce((n, m) -> n * m);

        // The optional forces us to acknowledge that the product might not
        //  actually exist in the case that the stream was empty.
        if (product.isPresent()) {
            System.out.println("    " + product.get());
        }

        List<Point> points = Arrays.asList(new Point[] {
                new Point(0, 0), new Point(1, 2), new Point(-3, -4),
                new Point(-1, 2), new Point(-6, 0), new Point(0, -3)});

        List<Double> list =
                points.stream()
                      .map(Point::getX)
                      .filter(x -> x < 0)
                      .collect(Collectors.toList());

        System.out.println("    " + list);
    }
}
