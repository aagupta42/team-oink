//public functions
pup::pup ()//class-object constructor === make a pup
	{ this->name=name;
	  this->species_type=species_type;
	  this->birth_date=birth_date;
	  this->hunger=hunger;//0
	  this->fur_dirt=fur_dirt;//0
	  this->happiness=happiness;//100
	}

	~pup::pup()//deconstructor === remove a pup
	{
	  delete name;
	  delete species_type;
	  delete birth_date;
	}


//increment 3 major parameter functions

	float pup::feed(hunger) //feed(hunger,food)
	{	
    		hunger=hunger+1;
	}
	
	float pup::clean(fur_dirt);
	{
  		fur_dirt=fur_dirt+1;
	}

	float pup::treat_play(happiness);
	{	
  		happiness=happiness+1;
	}

//decrement 3 major parameters <-- time dependent
//pup gets hungry every 4 hrs
float pup::fed_timelapse(last_fed)
	{ 
		time_t now;//gets current time in form 
        //		
	}
float pup::groomed_timelapse(last_groomed)
	{
	
	}
float pup::play_timelapse(last_play)
	{
	
	} 	

/**private:
string name;
string species_type;
float hunger;
float happiness;
float fur_dirt; 
time_t birth_date; //compare each time to time_t now <- which gives the current time, calls from an online clock
time_t last_fed;
time_t last_groomed;
time_t last_play;
**/
