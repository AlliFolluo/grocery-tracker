public class GroceryItem{

        private String name;
        private String department;
        private double price;
        private boolean isOnSale;

        public String getName() {
                return name;
        }

        public String getDepartment() {
                return department;
        }

        public double getPrice() {
                return price;
        }

        public boolean getOnSale() {
                return isOnSale;
        }

        public GroceryItem(String name, String department, double price, boolean isOnSale) {
                this.name = name;
                this.department = department;
                this.price = price;
                this.isOnSale = isOnSale;
        }

        public void activateSale(double salePercentage) {
                this.price -= this.price * salePercentage;
                this.isOnSale = true;
        }

        public String toString() {
                return "GroceryItem{" +
                        "name='" + name + '\'' +
                        ", department='" + department + '\'' +
                        ", price=" + price +
                        ", isOnSale=" + isOnSale +
                        '}';
        }
}
