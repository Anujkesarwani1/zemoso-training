package Assignment4;

public class KYCForm {
    public static void main(String[] args) {
        Form form = new Form();
        form.rangeKyc("16-07-1998", "27-06-2017");
        form.rangeKyc("04-02-2016", "04-04-2017");
        form.rangeKyc("04-05-2017", "04-04-2017");
        form.rangeKyc("04-04-2015", "04-04-2016");
        form.rangeKyc("04-04-2015", "15-03-2016");
    }
}

// Output:
// 16-06-2017 27-06-2017
// 05-01-2017 06-03-2017
// No range
// 05-01-2017 06-03-2017
// 05-03-2016 04-04-2016
// 05-03-2016 15-03-2016

