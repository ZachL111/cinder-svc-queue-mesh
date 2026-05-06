# Field Notes

The useful part of this repository is the small rule set around queue pressure and worker slack.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`edge` is the strongest case at 245 on `worker slack`. `recovery` is the cautious anchor at 168 on `session drift`.

The language-specific addition keeps the review model in a JVM-friendly data class.
