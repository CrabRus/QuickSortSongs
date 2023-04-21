public class Songs {
        private String name;
        private int duration;
        private int countOne;

        public Songs(String name, int duration){
            this.name = name;
            this.duration = duration;
        }

        public String getName() {
            return name;
        }
        public int getDuration(){
            return duration;
        }
        public void setCountOne(int countOne){
            this.countOne = countOne;
        }
        public int getCountOne(){
            return countOne;
        }


        @Override
        public String toString() {
            return "Название " + name + " | Длится " + duration + " секунд | Имеет "+countOne+" едениц";
        }
    }
