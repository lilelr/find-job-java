package producer_consumer; /**
 * Created by yuxiao on 5/22/18.
 */
import java.util.LinkedList;
import java.util.Objects;

public class Storage {
        private final int MAX_SIZE = 100;

        private LinkedList<Object> list = new LinkedList<>();

        public void produce(String producer){
            synchronized (list){
                while (list.size() == MAX_SIZE){
                    System.out.println("full");
                    try{
                        list.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                list.add(new Object());

                System.out.println("producing a product,now the size is "+list.size());

                list.notifyAll();
            }
        }

        public void consume(String consumer){
            synchronized (list){
                while (list.size() == 0){
                    System.out.println("empty");

                    try{
                        list.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                list.remove();
                System.out.println("consume a product "+list.size());
                list.notifyAll();
            }
        }

        public LinkedList<Object> getList(){
            return list;
        }

        public void setList(LinkedList<Object> list){
            this.list = list;
        }

        public int getMAX_SIZE(){
            return MAX_SIZE;
        }
}
