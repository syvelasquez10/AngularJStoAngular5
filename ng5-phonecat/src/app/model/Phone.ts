import { Hardware } from './Hardware';
import { Display } from './Display';
import { Android } from './Android';
import { Camera } from './Camera';
import { Connectivity } from './Connectivity';
import { SizeAndWeight } from './SizeAndWeight';
import { Battery } from './Battery';
import { Storage } from './Storage';

export class Phone {
  additionalFeatures: string;
  android: Android;
  availability: Array<string>;
  camera: Camera;
  connectivity: Connectivity;
  description: string;
  display: Display;
  hardware: Hardware;
  id: number;
  imageUrl: string;
  snippet: string;
  images: Array<string>;
  name: string;
  battery: Battery;
  sizeAndWeight: SizeAndWeight;
  storage: Storage;
}
