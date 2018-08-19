insert into event (name, contact, date, details, location, max_participants) values (
  'Test event 1', 'test@test.com', now(), 'some details', 'Tampere', 105
);
insert into event (name, contact, date, details, location, max_participants) values (
  'Event 2', 'test2@test.com', now(), 'some details of event 2', 'Helsinki', 80
);

insert into participant (name, email, verification_token, event_id) values (
  'John', 'john@john.com', '123abc', 1
);

insert into participant (name, email, verification_token, event_id) values (
  'Smith', 'smith@john.com', '124abc', 1
);

insert into participant (name, email, verification_token, event_id) values (
  'June', 'june@john.com', '125abc', 2
);

insert into participant (name, email, verification_token, event_id) values (
  'Abe', 'abe@john.com', '126abc', 2
);

insert into participant (name, email, verification_token, event_id) values (
  'Jill', 'jill@john.com', '127abc', 2
);
