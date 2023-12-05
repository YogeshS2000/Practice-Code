interface game {
    void right();

    void left();
}

class mario implements game {
    public void right() {
        System.out.println("right");
    }

    public void left() {
        System.out.println("left");
    }
}

class templerun implements game {
    public void right() {
        System.out.println("right");
    }

    public void left() {
        System.out.println("left");
    }
}

class gamingconsole {
    game games;

    public gamingconsole(game games) {
        this.games = games;
    }

    public void run() {
        games.right();
        games.left();
    }
}

class InterfaceCode {

    public static void main(String args[]) {
        // game obj = new templerun();
        // gamingconsole obj2 = new gamingconsole(obj);
        // obj2.run();

        int i, m = 0, flag = 0;
        int n = 4;// it is the number to be checked
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        } // end of else
    }
}