class CPU
{
        int price;
        CPU(int p)
        {
                this.price = p;
        }
        class processor
        {
                int noc;
                String man;
                processor(int n,String m2)
                {
                        this.noc = n;
                        this.man = m2;
                }
        }
        static class ram
        {
                int mem;
                String manf;
                ram(int m,String m1)
                {
                        this.mem = m;
                        this.manf = m1;
                }
        }
        
        public static void main(String args[])
        {
                CPU a= new CPU(10);
                CPU.processor p = a.new processor(5, "intel");
                CPU.ram r =  new CPU.ram(16, "ASUS");
                
                System.out.println("\n\nCPU price: "+a.price);
                System.out.println("\n\nNo. of cores in processor: "+p.noc);
                System.out.println("Processor manufacturer: "+p.man);
                System.out.println("\n\nRAM memory: "+r.mem);
                System.out.println("RAM manufacturer: "+r.manf);
        }
}
