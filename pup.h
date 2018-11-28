#ifndef PUP_H
#define PUP_H

class pup

{public:

pup ();
~pup();

//these functions will increment the 3 major paramaters for a healthy pet
//tied to the take-action buttons
//if you feed the pet, hunger will be minimized
float feed(hunger); 
float clean(fur_dirt);
float treat_play(happiness);

//how long ago was the last care-action taken? 
//time lapses will cause variables to decrement <- negative impact on pet's health
float fed_timelapse(last_fed);
float groomed_timelapse(last_groomed);
float play_timelapse(last_play);

//these functions will be related to the bar output	
//are you at an okay threshold?
bool isHappy(happiness);
bool isFull(hunger);
bool isClean(fur_dirt);

private:
string name;
string species_type;

float hunger=0; //hunger treated as a negative = max neg value=-100 
float happiness=100; //max happiness=100 //min happiness=0
float fur_dirt=0; //fur_dirt treated as a negative = max neg value= -100

time_t birth_date; //print on the player screen //and tomb stone? 

//compare each time to (time_t now)=which gives the current time, calls from an online clock
time_t last_fed;
time_t last_groomed;
time_t last_play;

};

#endif
