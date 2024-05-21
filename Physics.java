public class Physics {

    float calculateVelocity (float distance, int time){
        return distance/time;
    }

    float calculateVelocity (float intialVelocity, float acceleration, int time) {
        return intialVelocity + (acceleration * time);
    }

}
