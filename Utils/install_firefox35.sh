# Author: Lalitha Rajanala
# How to invoke : bash install_firefox35.sh <path to directory>
# Example: bash install_firefox35.sh /home/user/firefox35
# 
#

directory=$1
if [ -d $1]
then
if [ -f $1/firefox-35.0.tar.bz2 ];
then
   rm -rf $1/firefox-35.0.tar.bz2
else
   echo "Firefox 35 will be downloaded to /tmp/firefox-35.0.tar.bz2"
fi

echo "The directory is $1"
echo "************************************************************************************"
cd $1;curl -O  http://ftp.mozilla.org/pub/mozilla.org/firefox/releases/35.0/linux-x86_64/en-US/firefox-35.0.tar.bz2
tar -xvf firefox-35.0.tar.bz2
if [ -f /usr/bin/firefox ];
then
   echo "/usr/bin/firefox exists deleting it"
   rm  -f /usr/bin/firefox
fi
   echo "Installing firefox at /usr/bin/firefox"
   ln -s $1/firefox/firefox /usr/bin/firefox
   ls -lrt /usr/bin/firefox
else
   echo "$1 is not a valid directory."
fi
