
#!/bin/sh
echo "Enter the roll no"
read roll_no
echo "Enter the name"
read name
echo "Enter the email"
read email
echo "Enter the Age"
read age


echo "Roll no : ${roll_no}"
echo "Name : ${name}"
echo "Email : ${email}"

if [[ $age -gt 100 ]] || [[ $age -lt 0 ]]
then
echo "INVALID NUMBER"
fi

if [ $age -gt 18 ]
then
echo "Eligible"
else
echo "Not Eligible"
fi
