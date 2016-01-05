HBase Custom Formatter
======================

Example custom formatter for avro using example customer profiles.


The HBase shell allows the use of a Custom Formatter for interpreting and presenting binary types.
This example demonstrates the use of a Custom Formatter that deserializes a customer profile avro type
and displays the otherwise obsfuscated content to to the user within the HBase shell.

To run the example
==================

mvn compile
mvn test
mvn package

Copy the jar to a known location in the filesystem on the machine from which you will use the HBase Shell.

Register the jar with the HBase Shell by starting the hbase shell (e.g. ./hbase shell).

hbase(main):001:0> require 'customerprofileformatter-1.0-SNAPSHOT.jar'
=> true

You can now use the formatter to inspect your data using the following syntax.

scan 'profiles', { COLUMNS => 'profile:data:c(Java::ExampleAvro::CustomerProfileFormatter).format'}

get 'profiles', 'user-1' , 'profile:data:c(Java::ExampleAvro::CustomerProfileFormatter).format'

Before
======

![Before](http://github.com/rsiwicki/customerprofileformatter/raw/master/images/before_custom_formatter_use.png)

After
=====

![After](http://github.com/rsiwicki/customerprofileformatter/raw/master/images/after_custom_formatter_use.png)




