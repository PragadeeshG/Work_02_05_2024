create table if not exists retail_schedule_job(
retail_job_id integer not null,
retail_job_name varchar(255) null,
retail_job_script varchar(255) null,
retail_job_start_time varchar(255) null,
retail_job_end_time varchar(255) null,
retail_job_owner varchar(255) null,
auto_run char null,
manual_run_indicator varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint retail_schedule_job_pk primary key(retail_job_id));