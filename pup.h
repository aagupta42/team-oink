#ifndef PUP_H
#define PUP_H
class pup

{public:
pup ();
~pup();
float feed(hunger);
float clean(fur_dirt);
float treat_play(happiness);

private:
string name;
string species_type;
float hunger=0;
float happiness=100;
float fur_dirt=0;
t_time birth_date;

};

#endif
