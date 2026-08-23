enum Status {
    Read, write,stop;
}


/**
 * EnumConcept
 */
public class EnumConcept {

    public static void main(String[] args) {
        // Status s = Status.Read;
        // System.out.println(s.ordinal());
        // System.out.println(Status.values()[0]);


        // switch (s) {
        //     case Read:
        //         System.out.println("reading");
        //         break;
        
        //     default:
        //         break;
        // }



        StatusCode sc[] = StatusCode.values();

        for(StatusCode ind: sc){
            System.out.println(ind +":"+ ind.getCode());
        }
    }
}



enum StatusCode {

    Success (200), Created(201),Unauthorized(401),NotModified(304),NotFound;


    private int code;
    private StatusCode(){
        this.code= 404;
    }

    private StatusCode(int code){
        this.code = code;
    }


    public int getCode(){
        return this.code;
    }
}