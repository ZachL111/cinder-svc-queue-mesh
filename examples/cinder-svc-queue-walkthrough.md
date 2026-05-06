# Cinder Svc Queue Mesh Walkthrough

This note is the quickest way to read the extra review model in `cinder-svc-queue-mesh`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 201 | ship |
| stress | retry load | 202 | ship |
| edge | worker slack | 245 | ship |
| recovery | session drift | 168 | ship |
| stale | queue pressure | 190 | ship |

Start with `edge` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around retry load and session drift.
