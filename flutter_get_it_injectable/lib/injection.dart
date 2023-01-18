import 'package:get_it/get_it.dart';
import 'package:injectable/injectable.dart';
import 'package:flutter_get_it_injectable/injection.config.dart';

final getIt = GetIt.instance;

@InjectableInit(preferRelativeImports: false)
void configureDependencies() => getIt.init();

