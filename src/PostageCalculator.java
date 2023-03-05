public class PostageCalculator {

    public static double calculatePostage(String from, String to, double weight, double length, double width, double height){
        double baseCost = 3.75;

        // calculating county cost;
        double countyCost = Math.abs(Double.parseDouble(from.substring(0, 3)) - Double.parseDouble(to.substring(0, 3))) / 100;

        // calculating weight cost
        double weightCost = Math.ceil(weight * 10) * 0.05;

        // calculating oversize cost:
        double oversizeCost = 0;
        if (length + width + height > 36){
            oversizeCost = (length + width + height - 36) * 0.10;
        }

        // calculating overweight cost
        double overweightCost = 0;
        if (weight > 40) {
            overweightCost = Math.ceil((weight - 40) * 10) * 0.10;
        }

        return baseCost + countyCost + weightCost + oversizeCost + overweightCost;
    }

    public static double calculatePostage(Address from, Address to, double weight, double length, double width, double height){
        return calculatePostage(from.getZip(), to.getZip(), weight, length, width, height);
    }

    public static double calculatePostage(Package pack){
        return calculatePostage(pack.getOrigin(), pack.getDestination(), pack.getWeight(), pack.getLength(), pack.getWidth(), pack.getHeight());
    }

}
