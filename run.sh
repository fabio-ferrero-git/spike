#echo "Running docker-compose up -d ... "
#echo "Name of the main container: $1"
#docker-compose -p $1 up -d

echo "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***"
echo "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++"
echo ""
echo "RUNNING docker-compose up -d ... "
echo ""

if [ -z "$1" ]
then
      echo "Name of the main container is the default one: spikeTaassProject"
      echo ""
      echo "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++"
      echo "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***"
      docker-compose up -d
else
      echo "Name of the main container is: $1"
      echo ""
      echo "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++"
      echo "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***"
      docker-compose -p $1 up -d
fi