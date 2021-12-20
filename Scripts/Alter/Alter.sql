	use ta_lab;
    
    alter table student add dni int;
    alter table student add birthday datetime;
    alter table professor add dni int;
    alter table course drop creation_date;
    alter table college modify column foundation_age year; 