

{public:

pup::pup ()
{this->name=name;
this->species_type=species_type;
this->birth_date=birth_date;
}
~pup()
{}

float feed(hunger) //feed(hunger,food)
{
    hunger=hunger+1;
}
float clean(fur_dirt);
{
  fur_dirt=fur_dirt-1;
}
float treat_play(happiness);
{
  happiness=happiness-1;
}

private:
string name;
string species_type;
float hunger;
float happiness;
float fur_dirt;

};

#endif
